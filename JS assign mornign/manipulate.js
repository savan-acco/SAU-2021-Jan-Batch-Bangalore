

myFunction=function()
{

var reg=/\D/;
let x=document.getElementById("prime_factors").value;

if(reg.test(x))
console.log('not valid');
else
{

    let z=0;
    let arr=[];

    while(x%2==0)
    {
        x=x/2;
        z=1;
    }

    if(z==1)
    arr.push(2);

    z=0;


    for(let i=3;i<=Math.sqrt(x);i+=2)
    {
        while(x%i==0)
        {
            z=1;
            x=x/i;
        }


        if(z==1)
        arr.push(i);

        z=0;

    }

    if(x!=1)
    arr.push(x);

    var store="";
    for(let i=0;i<arr.length;i++)
    store=store+arr[i]+" ";

    console.log(store);

    document.getElementById("prime_factors1").innerHTML="Prime Factors are " + store;

    console.log('valid');
}

}


low_upp=function()
{
var reg=/\d/;
var x=document.getElementById("low_upp").value;

if(reg.test(x))
console.log('not valid');
else
{
    console.log('valid');
    let a=x.toLowerCase();    
    let b=x.toUpperCase();

    document.getElementById("here_low_upp").innerHTML="LowerCase is - "+a;
    document.getElementById("here_low_upp1").innerHTML="UpperCase is - "+b;

}

}

same_or_not=function()
{
var reg=/\D/;
var x=document.getElementById("same_or_not").value;

if(reg.test(x))
document.getElementById("same_or_not1").innerHTML="Enter valid details";
else
{
    console.log('valid');
    let z=x[0];

    let flg=0;
    for(let i=1;i<x.length;i++)
    {
    if(x[i]!=z)
    flg=1;
    }

    if(flg)
    {
        document.getElementById("same_or_not1").innerHTML="All digitst Not same";
    }
    else
    {
        document.getElementById("same_or_not1").innerHTML="All digitst same";
    }
}

}

sum=function()
{
var reg=/\D/;
var x=document.getElementById("sum").value;

if(reg.test(x))
document.getElementById("sum1").innerHTML="Enter valid details";
else
{
    let sum=0
    for(let i=0;i<x.length;i++)
    {
        sum=sum+parseInt(x[i]);
    }
    document.getElementById("sum1").innerHTML="Sum is "+sum;

}
console.log('valid');

}

formsubmit=function()
{
    let firstname = document.getElementById("firstname").value;
    let secondname = document.getElementById("secondname").value;

   

    var e = document.getElementById("car_selected").value;
   

    let z="";
    if (document.getElementById('male').checked) {
        z = document.getElementById('male').value;
      }
    if (document.getElementById('female').checked) {
        z = document.getElementById('female').value;
    }
    if (document.getElementById('other').checked) {
        z = document.getElementById('other').value;
      }

     

      var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
      let emailid=document.getElementById("emailid").value;
      
      if(emailPattern.test(emailid))
      {
        
      }
      else
      {
        emailid="not valid emailid";
        document.getElementById("formsub").innerHTML="Enter valid email-id";
        return ;
      }

      var obj={
          firstname: firstname,
          secondname: secondname,
          emailid: emailid,
          gender: z,
          car:e
      }

      console.log(obj);

      document.getElementById("formsub").innerHTML=`Your name is ${obj.firstname} ${obj.secondname}.    
       your email-id is ${obj.emailid}      your gender is ${obj.gender}      your car is ${obj.car}
      `;

      document.getElementById("car_selected").value="";
      document.getElementById('male').checked=0;
      document.getElementById('female').checked=0;
      document.getElementById('other').checked=0;
      document.getElementById("firstname").value="";
      document.getElementById("secondname").value="";
      document.getElementById("emailid").value="";
}

