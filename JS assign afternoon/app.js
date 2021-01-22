class input {
    constructor(param) {
        this.input = param;
    }
    calculateLength() {
        return this.input.length;
    };
    getUpperCase() {
        return this.input.toUpperCase();
    };
    getLowerCase() {
        return this.input.toLowerCase();
    };

    
    getseparate_vowels_and_consonants() {
        
        let vowels=[];
        let conso=[];
        
        for(let i=0;i<this.input.length;i++)
        {
            if(this.input[i]=='a'||this.input[i]=='e'||this.input[i]=='i'||this.input[i]=='o'||
            this.input[i]=='u'||this.input[i]=='A'||this.input[i]=='E'||this.input[i]=='I'||
            this.input[i]=='O'||this.input[i]=='U')
            {
                if(vowels.length&&vowels.includes("this.input[i]"))
                {

                }
                else
                {
                    vowels.push(this.input[i]);
                }
            }
            else
            {
                if(conso.indexOf("this.input[i]")>=0)
                {

                }
                else
                {
                    conso.push(this.input[i]);
                }
            }

        }

       var obj1={
           vowels:vowels,
           conso:conso
       }

      // console.log(obj1);

       return obj1;

    };
    
}


class Student {
    constructor(firstname,secondname,gender,rollno,dob,bday) {
        this.firstname = firstname;
        this.secondname=secondname;
        this.gender=gender;
        this.rollno=rollno
        this.dob=dob;
        this.bday=bday;
    }
}




closure_here= function()
{
    var arr=[];

    function tmp(obj)
    {
        arr.push(obj);
        return arr;
    }

    return tmp;
}


caller=closure_here();

let looper;
function formsubmit()
{
    let firstname = document.getElementById("firstname").value;
    let secondname = document.getElementById("secondname").value;


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

    let rollno=document.getElementById('roll-number').value;
    let bday=document.getElementById('birthday').value;
    let dob=document.getElementById('age').value;

      

    let obj = new Student(firstname,secondname,z,rollno,dob,bday);
    
    
    looper=caller(obj);
    

}



find_details=()=>{

    let x=document.getElementById("getdetails").value;
    
     //console.log(x);


     for(let i=0;i<looper.length;i++)
     {
        
       let p=looper[i].rollno;

       if(p==x)
       {
        var mydiv = document.getElementById("put");
        // mydiv.appendChild(document.createTextNode(" Name is "+looper[i].firstname+" "+looper[i].secondname));
        // mydiv.appendChild(document.createTextNode(" D.O.B is "+looper[i].dob));
        // mydiv.appendChild(document.createTextNode(" Birthday is "+looper[i].bday));
        // mydiv.appendChild(document.createTextNode(" Gender is "+looper[i].gender));
         mydiv.innerHTML=" Name is "+looper[i].firstname+" "+looper[i].secondname+" D.O.B is "+looper[i].dob+
         " Birthday is "+looper[i].bday+" Gender is "+looper[i].gender;

        console.log(looper[i].firstname);
        console.log(looper[i].secondname);
        console.log(looper[i].gender);
        console.log(looper[i].bday);
        console.log(looper[i].dob);
        
       }
       
      }

  
    // console.log(x);

}



function callFunction() {
    var inputValue = document.getElementById("inputTxt").value;
    let inputObject = new input(inputValue);
    

    let reg=/\d/;
    if(reg.test(inputValue))
    {
        document.getElementById("geterror").innerHTML="Enter valid input";
        return ;
    }
    else
    {

    }

    document.getElementById("lengthOp").innerHTML = inputObject.calculateLength();
    document.getElementById("ucOp").innerHTML = inputObject.getUpperCase();
    document.getElementById("lcOp").innerHTML = inputObject.getLowerCase();

    let x=inputObject.getseparate_vowels_and_consonants();
    document.getElementById("vowcon").innerHTML ="Vowels are "+  x.vowels + "    Consonants are " + x.conso;

}