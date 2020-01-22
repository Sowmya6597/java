function add(p:string,q:string):any
function add(x:number,y:number):any
function add(n1:any,n2:any):any
{
    return n1+n2;
}
var concat =add("TypeScript","Function Overloading");
console.log(concat);
var sum=add(7,9);
console.log(sum);