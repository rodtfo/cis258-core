const readlinetest = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  })

// Get a random integer from 1 to 10 inclusive
const num = Math.ceil(Math.random() * 10);


//const gnum = prompt('Guess the number between 1 and 10 inclusive: ');

readlinetest.question('Guess the number between 1 and 10 inclusive: ', (gnum) => {

console.log(num);

 if (gnum == num)
   console.log('Matched');
  else
   console.log('Not matched, the number was '+gnum) 
   readlinetest.close()
})

/*readlinetest.question(`What's your name?`, (name) => {
    console.log(`Hi ${name}!`)
    readlinetest.close()
  })*/

