class Hello
{
    constructor(fname,lname,age)
    {
        this.fn=fname;
        this.ln=lname;
        this.a=age;
    }
    full_name()
    {
        return this.fn + '    ' +this.ln;
    }
}
let h1=new Hello('Sony','Varsha',21);
console.log("FullName :" +h1.full_name())