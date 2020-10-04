//Fibonncci series upto 100 terms.
let series = [0, 1];

for (let i = 0; i < 10; i++) {
    if (i>1) 
        series[i] = series[i-1] + series[i-2];
    console.log(series[i]);
}
