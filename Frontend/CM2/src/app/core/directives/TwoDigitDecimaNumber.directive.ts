import { Directive, ElementRef, HostListener, NgModule, Renderer2 } from "@angular/core";
import { DecimalPipe } from '@angular/common';

@Directive({
  selector: "[appTwoDigitDecimaNumber]",
  providers: [DecimalPipe]
})
export class TwoDigitDecimaNumberDirective {
  // Allow decimal numbers and negative values
  private regex: RegExp = new RegExp(/^(\d{1,16}|(\d{0,16}\.)?\d{0,2})$/g);
  // Allow key codes for special events. Reflect :
  // Backspace, tab, end, home
  private specialKeys: Array<string> = [
    "Backspace",
    "Tab",
    "End",
    "Home",
    "ArrowLeft",
    "ArrowRight"
  ];

  constructor(private el: ElementRef) { }
  @HostListener("keydown", ["$event"])
  onKeyDown(event: KeyboardEvent) {
    ////console.log(this.el.nativeElement.value);
    // Allow Backspace, tab, end, and home keys
    if (this.specialKeys.indexOf(event.key) !== -1) {
      return;
    }
    const current: string = this.el.nativeElement.value;
    const position = this.el.nativeElement.selectionStart;
    const next: string = [
      current.slice(0, position),
      event.key,
      current.slice(position)
    ].join("");
    if (next && !String(next).match(this.regex)) {
      event.preventDefault();
    }
  }
}
