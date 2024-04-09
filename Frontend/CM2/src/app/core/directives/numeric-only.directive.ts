import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appNumericOnly]'
})
export class NumericOnlyDirective {
  constructor(private el: ElementRef) { }

  @HostListener('input', ['$event'])
  onInput(event: Event) {
    const inputElement = this.el.nativeElement as HTMLInputElement;
    const initialValue = inputElement.value;

    // Remove non-numeric characters using a regular expression
    const numericValue = initialValue.replace(/[^0-9]/g, '');

    // Update the input field with the numeric value
    inputElement.value = numericValue;
    // Emit the input event to ensure Angular bindings update properly
    inputElement.dispatchEvent(new Event('input'));
  }
}
