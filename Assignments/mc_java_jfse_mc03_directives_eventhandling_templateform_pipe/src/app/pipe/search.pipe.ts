import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})

// Implement logic to filter the given contacts based on given searchText
// Convert text to lowercase
export class SearchPipe implements PipeTransform {

  transform(contacts: any, searchText: any): any {
    if(contacts == false)return null;  //
        if(searchText == false)return contacts;  //

        searchText = searchText.toLowerCase();

        return contacts.filter(function(item){
            return JSON.stringify(item).toLowerCase().includes(searchText);
        });
  }


}
