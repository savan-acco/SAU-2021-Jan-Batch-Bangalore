// import { Component } from '@angular/core';

// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent {
//   title = 'angular-assign';
// }

import { Component } from '@angular/core'; 
  
@Component({ 
    selector: 'app-root', 
    templateUrl: './app.component.html', 
    styleUrls: ['./app.component.css'] 
}) 
export class AppComponent { 
  
    /* An empty array that is responsible 
       to add a division */
    public items = []; 
  
    /* A two-way binding performed which 
       pushes text on division */
    public newTask; 
    public newTrainer;
    public newDate; 
  
    public editTask; 
    public editTrainer;
    public editDate; 
  
  
    /* When input is empty, it will 
       not create a new division */
    public addToList() { 
        if (this.newTask == '') { 
        } 
        else { 
             var obj={
               name:this.newTask,
               trainer:this.newTrainer,
               date:this.newDate
             }

             console.log(obj);

            this.items.push(obj); 
            this.newTask = ''; 
            this.newTrainer='';
        } 
    } 
  
    /* This function takes to input the 
       task, that has to be deleted*/
    public deleteTask(index) { 
        this.items.splice(index, 1); 
    } 

    public edit(index) { 

      if(this.editTask.length)
      this.items[index].name=this.editTask;
      
      if(this.editTrainer.length)
      this.items[index].trainer=this.editTrainer;
      
      if(this.editDate)
      this.items[index].date=this.editDate;
      


      console.log(this.items);
      this.editTask="";
      this.editTrainer="";
      this.editDate="";
  } 
}

