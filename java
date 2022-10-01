pipeline {   
 agent  {
      label {       
		 label "build-in"
         customWorkspace "/mnt/data"
            }
        }			
  stages{
    stage('frist'){
        steps{
          sh "yum install httpd -y "
	  sh "service httpd start"
		      } 
			      }
				  
	stage('second'){
        steps{
          sh "echo 'hello' << /var/www/html"
		  sh "chmod - R 777 /var/www/html/index.html"
		      } 
			      }
	


                  }
          }
