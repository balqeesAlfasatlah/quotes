# Gson

## Task

Use the file recentquotes.json to show random popular book quotes.
Your program should use GSON to parse the .json file. 
The app needs no functionality other than showing the quote and 
the author when it is run. The app should choose one quote each time it is run.

## install dependencies

 + using :

 implementation 'com.google.code.gson:gson:2.8.8' 
 
in build.gradle file 

+ then we must build the project then it will download the libraries automatically

## Testing 

I pick random quotes from the file to make sure in the test that the quote exist in the file
- test in intelliJ : by running the app 
- test in terminl : "./gradlew test"