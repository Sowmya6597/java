const myPromise=new Promise((resolve,reject)=>{
if(Math.random() *15<=90)
{
    resolve('Hello, Promise');
}
reject(new Error('In 10% cases, I fail.'));
});
const onResolved = (resolvedValue) => console.log(resolvedValue);
const onRejected = (error) => console.log(error);
myPromise.then(onResolved,onRejected);
