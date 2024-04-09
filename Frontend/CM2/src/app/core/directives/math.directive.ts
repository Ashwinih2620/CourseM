 import { Directive,OnChanges,OnInit,ElementRef, Input } from '@angular/core';

@Directive({
    selector: '[MathJax]'
})
export class MathJaxDirective {
    @Input('MathJax') fractionString: string;

    constructor(private el: ElementRef) {
    }

    ngOnChanges() {
      //console.log('>> ngOnChanges');
       this.el.nativeElement.style.backgroundColor = 'yellow';
       this.el.nativeElement.innerHTML = this.fractionString;
     //  MathJax.Hub.Queue(["Typeset",MathJax.Hub, this.el.nativeElement]);
    }
}
