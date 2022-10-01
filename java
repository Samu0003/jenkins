pipeline {   
 agent any
 customWorkspace "/mnt/dta"
 
  stages{
    stage('frist'){
        steps{
          sh "yum install httpd -y "
	     } 
		  }
				  
	stage('second'){
        steps{
          sh "cp -r index.html /var/www/html"
		  sh "chmod - R 777 /var/www/html/index.html"
		      } 
			      }
				  
    stage('third'){
        steps{
          sh "servcie httpd restart "
		      } 
			      }


                  }
          }
