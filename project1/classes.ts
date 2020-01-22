export class Employee { 
    id:number;
    name:string;
    dob:Date; 
  
    
    constructor(id:number,name:string,dob:Date) { 
       this.id = id;
       this.name=name;
       this.dob=dob;
    } 
} 
    let emp=new Employee(1,'Sowmya',new Date());
    console.log('Name:'+emp.name);
    console.log('ID :'+emp.id);
    console.log('Date of Birth :'+emp.dob);
    