import { Directive, ElementRef, HostListener } from '@angular/core';
import { NgControl } from '@angular/forms';

@Directive({
  selector: '[appNegativeValue]'
})
export class NegativeValueDirective {

  constructor(private el: ElementRef, private control: NgControl) {}

  @HostListener('input', ['$event']) onInput(event: Event): void {
    const inputElement = this.el.nativeElement as HTMLInputElement;
    const inputValue = inputElement.value;

    if (parseFloat(inputValue) < 0) {
      this.control.control.setValue(0); // Set the form control value to 0 if it's negative
    }
  }
}
