import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appTabToNext]'
})
export class TabToNextDirective {

  constructor(private el: ElementRef, private renderer: Renderer2) { }

  @HostListener('keydown.tab', ['$event'])
  onKeyDown(event: KeyboardEvent) {
    //console.log("inside tab directive");
    event.preventDefault();
    this.blurCurrentInput();
    this.focusNextCell();
  }

  private blurCurrentInput() {
    const input = this.el.nativeElement;
    if (input) {
      input.blur();
    }
  }

  private focusNextCell() {
    const nextCell: HTMLElement | null = this.el.nativeElement.parentElement.nextElementSibling;
    if (nextCell) {
       
            // Make the next cell editable and focus on it
            const clickEvent = new MouseEvent('click', { bubbles: true });
            nextCell.dispatchEvent(clickEvent);
          
    }
  }
}
