//Source https://wiki.osdev.org/UEFI
//This is a small Hello World Program runnable from UEFI Shell befor OS starts

#include <efi.h>
#include <efilib.h>

EFI_STATUS
EFIAPI
efi_main(EFI_HANDLE ImageHandle, EFI_SYSTEM_TABLE *SystemTable){
  InitializeLib(ImageHandle, SystemTable);
  SystemTable->BootServices->SetWatchdogTimer(0, 0, 0, NULL);
  uefi_call_wrapper(ST->ConOut->ClearScreen, 1, ST->ConOut);
  Print(L"Hello, World!\n");
  uefi_call_wrapper(ST->BootServices->Stall, 1, 2000000);
  Print(L"Stay tuned for the Choo Chootloader!\n");
  uefi_call_wrapper(ST->BootServices->Stall, 1, 2000000);
  uefi_call_wrapper(ST->ConOut->ClearScreen, 1, ST->ConOut);
  return EFI_SUCCESS;
}
