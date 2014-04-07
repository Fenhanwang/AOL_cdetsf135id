AOL_cdetsf135id
===============
Hi,AOLs!!
Here is Fenhan Wang
Based on my understanding of requirement, I finish all the task and Bonus tasks (except hook up with cobertura code)!!
Since my mac lost tools.jar, I cannot use cobertura althouth I download a tools.jar


Here is some instructions:
1.I assume you have maven 2 installed, so if you get my project, please use:

mvn compile jetty:run

I already set the url=http://localhost:9090/tys2345
you will see a login page which is not registion page, then you can click register button to the Register.jsp page.
Then, you should fill the blanks, click submit. your HTTP post request will be automaticly directed to http://myopenissues.com/magento/ and you can see any kinds of response on you local servlet.
You can register a new user through the webapp.

2. I assume you have Tomcat 6 installed, so in the project folder, there is a WAR file called tys2345.war.
you can just deploy the war file through Tomcat management page.


3.For bonus tasks, I combine task 1 and 5 together, which means I create JUnit and, in the test code, I use Selenium webdriver (firefox webdriver) to test my webapp. I fail to install cobertura so that I just comment cobertura dependency in POM.xml.

4.I checkin the my webapp into github and hooked them with Travis-CI.
The name is AOL_cdetsf135id
here is my github link(you can also see that in my resume): https://github.com/Fenhanwang
here is my Travis-CI link: https://travis-ci.org/Fenhanwang/AOL_cdetsf135id
here is my Travis-CI image url: https://travis-ci.org/Fenhanwang/AOL_cdetsf135id.svg?branch=master
Because, as I said, I combine Selenium into test code, I can only run mvn compile in Travis-CI. There is no webdriver installed on their linux system.(Although I can install a phantomjs using ghostwebdriver on it)

5.Finally, I deploy my webapp on AWS. Since I just found their Tomcat 7 and Java7 webserver.
There is a small bug if you check the webapp on AWS: if you click submit and the brower will return pure HTML code from http://myopenissues.com/magento/ instead of a readable web page.
Here is the url of AWS:
http://default-environment-krxzthqmfm.elasticbeanstalk.com/
