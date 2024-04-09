import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'lineBreak',
})
export class LineBreakPipe implements PipeTransform {
    transform(input: string): string {
        return input.replace(/\s/g, '<br/>');
      }
}
