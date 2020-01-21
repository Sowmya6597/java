var promise=new Promise(function(resolve,reject)
{
    setTimeout(resolve,5000)
})
promise.then(function()
{
    console.log("this is done")


})
promise.then(function()
{
    console.log("this is also done")


})
promise.then(function()
{
    console.log("EXIT")

})
