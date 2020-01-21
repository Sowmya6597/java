var arr=new Array(10)
for(let i=0;i<arr.length;i++)
{
    arr[i]=Math.floor(Math.random()*100)
    console.log(arr[i])
}
let div=arr.filter((x)=>x%2==0 && x%5==0)
let inc=arr.map((x)=>parseInt(x*1.1))
console.log("Filter :" +div);
console.log("increment :" +inc);