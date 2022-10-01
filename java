pipeline { 
 agent any
 
 stages{
   stage('1st'){
      steps{
          sh" echo' hello all' "
           }
               }
        }       
 
         }
