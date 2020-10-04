import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageSorter extends JFrame implements KeyListener, DropTargetListener {

    private JFrame frame;
    private File directory;
    private File image;
    private String last;
    private JLabel jLabel;
    private JLabel imageLabel;
    private  JLabel progress;

    public static void main(String[] args) {
        Main main = new Main();
        main.frame = new JFrame("Sorter");
        main.jLabel = new JLabel();
        main.jLabel.setText("ImageDir");
        main.jLabel.setDropTarget(new DropTarget(main.jLabel, main));
        main.imageLabel = new JLabel();
        main.progress = new JLabel();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(main.jLabel);
        panel.add(main.imageLabel);
        panel.add(main.progress);
        main.frame.add(panel);
        main.frame.setSize(300, 500);
        main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.frame.setVisible(true);
        main.frame.addKeyListener(main);
    }

    @Override
    public void dragEnter(DropTargetDragEvent dropTargetDragEvent) {

    }

    @Override
    public void dragOver(DropTargetDragEvent dropTargetDragEvent) {

    }

    @Override
    public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent) {

    }

    @Override
    public void dragExit(DropTargetEvent dropTargetEvent) {

    }

    @Override
    public void drop(DropTargetDropEvent dropTargetDropEvent) {
        final List result = new ArrayList();
        int action = dropTargetDropEvent.getDropAction();
        dropTargetDropEvent.acceptDrop(action);
        try {
            Transferable data = dropTargetDropEvent.getTransferable();
            DataFlavor flavors[] = data.getTransferDataFlavors();
            if (data.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
                List<File> list = (List<File>) data.getTransferData(
                        DataFlavor.javaFileListFlavor);
                processFiles(list);
            }
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            dropTargetDropEvent.dropComplete(true);
            repaint();
        }
    }

    public void processFiles(List<File> files) {
        for (File f: files) {
            System.out.println(f.toString());
        }
        if (files.get(0).isDirectory()) {
            directory = files.get(0);
            imageLabel.setText(directory.toString());
        }
        if (directory != null) {
            boolean allesDrin = true;
            String name = "NoneRandomSomething";
            for (File file : directory.listFiles()) {
                System.out.println(file.toString());
                if (!name.contains(file.getName())) {
                    allesDrin = false;
                }
            }
            if (!allesDrin) {
                JOptionPane.showMessageDialog(null, directory.toString() + " is not a valid Directory");
            } else {
                loadImage();
            }
        }
    }

    public void loadImage() {
        image = new File(directory.getAbsolutePath() + File.separator + "Random" + File.separator).listFiles()[0];
        imageLabel.setIcon(new ImageIcon(new ImageIcon(image.toString()).getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
        frame.repaint();
        progress.setText("" + new File(directory.getAbsolutePath() + File.separator + "Random" + File.separator).listFiles().length);
    }

    public void moveImage(boolean something) {
        if (something) {
            System.out.println(image.getName() + " -> " + new File(directory.getAbsolutePath() + File.separator + "Something" + File.separator + image.getName()));
            image.renameTo(new File(directory.getAbsolutePath() + File.separator + "Something" + File.separator + image.getName()));
        } else {
            System.out.println(image.getName() + " -> " + new File(directory.getAbsolutePath() + File.separator + "None" + File.separator + image.getName()));
            image.renameTo(new File(directory.getAbsolutePath() + File.separator + "None" + File.separator + image.getName()));
        }
        last = image.getAbsolutePath();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        System.out.println("Key Typed " + keyEvent.getKeyChar());
        if (keyEvent.getKeyChar() == 'n') {
            System.out.println("Nothing");
            moveImage(false);
            loadImage();
        } else if (keyEvent.getKeyChar() == 's') {
            System.out.println("Something");
            moveImage(true);
            loadImage();
        }else if (keyEvent.getKeyChar() == 'x'){
            System.out.println("Back");
            File image = new File(last);
            System.out.println(image.getAbsolutePath() + " -> " + new File(directory.getAbsolutePath() + File.separator + "Random" + File.separator + image.getName()).toString());
            image.renameTo(new File(directory.getAbsolutePath() + File.separator + "Random" + File.separator + image.getName()));
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

}
