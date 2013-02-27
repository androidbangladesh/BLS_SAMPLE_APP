<h3>BLS_SAMPLE_APP</h3>
<p> This is a sample app which uses bls-1.0 library for Bangla suport</p>
<p>
Download this project: <br/>
git clone git://github.com/androidbangladesh/BLS_SAMPLE_APP.git <br/>
Browse in the assets folder you will find solaimanlipinormal.ttf font <b> NOTE: NO OTHER FONT WILL WORK WITH BLS-1.0 </b> 
</p>
<p>
The libs folder has the bls-1.0.jar library
</p>
<p>
Copy the font in the assets folder and copy bls-1.0.jar in libs folder of your project. Create libs folder if it doesn't exist.
Add bls-1.0.jar to your project's buildpath
From your Activity class call <br />
BengaliUnicodeString.getBengaliUTF(Main.this,text,textview); <br/>
<li>Main.this: Is the Context <li/>
text: The Bengali text to be rendered <br/>
textview: Is the textview <br/>
These three parameters must be passed to the method
</p>
