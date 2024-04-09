import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'decimalFormat',
})
export class DecimalFormatPipe implements PipeTransform {
  transform(value: number | string): string {
    if (value === null || value === undefined) {
      return ''; // Handle null or undefined values
    }

    // Convert value to a number (if it's a string)
    const numericValue =
      typeof value === 'string' ? parseFloat(value) : Number(value);

    // Check if the value is a valid number
    if (isNaN(numericValue)) {
      return ''; // Return an empty string for non-numeric values
    }

    // Convert to exponential notation if needed
    const exponentialValue = numericValue.toExponential();
    const decimalPlaces = 2;

    // Display '0' if the value is close to zero in exponential notation, otherwise, show the numeric value with two decimal places
    const formattedValue: string = Math.abs(numericValue) < 1e-10
    ? '0' : numericValue.toFixed(2);

    return formattedValue;
  }
}
