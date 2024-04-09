import { Directive, HostListener } from "@angular/core";

@Directive({
    selector: "input[BlockLateralArrowNavigation]",
  })
  
  export class BlockLateralArrowNavigationDirective {
    @HostListener("keydown.arrowleft", ["$event"]) arrowLeftPressed(
      event: KeyboardEvent
    ) {
      event.stopPropagation();
    }
  
    @HostListener("keydown.arrowright", ["$event"]) arrowRightPressed(
      event: KeyboardEvent
    ) {
      event.stopPropagation();
    }
  
    constructor() {}
  }