import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appAddDecimal]'
})
export class AddDecimalDirective {

  constructor(private el: ElementRef) { }

  @HostListener('input', ['$event']) onInput(event: InputEvent): void {
    const inputElement = this.el.nativeElement as HTMLInputElement;
    const inputValue = inputElement.value;

    // Check if the input value is a number and has three or more digits
    if (!isNaN(Number(inputValue)) && inputValue.length >= 3) {
      // Add .00 to the input value
      inputElement.value = Number(inputValue).toFixed(2);
    }
  }
}
