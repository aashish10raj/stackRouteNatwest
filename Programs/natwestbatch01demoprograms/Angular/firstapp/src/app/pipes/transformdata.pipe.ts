import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'transformdata'
})
export class TransformdataPipe implements PipeTransform {

  transform(value:string): string {
    let x=value.substring(0,3);
    let y=value.substring(3,6);
    let z=value.substring(6,value.length);

    return x.concat('-').concat(y).concat('-').concat(z);
  }

}
