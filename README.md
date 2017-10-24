Yahoo Query API by Swagger 

This is a sample project with a swagger file containing the info for the Yahoo Query API

You can see an example of usage in the App.java file, those values are to retrieve Yahoo finance data. 
You can figure out what to use by going to the [YQL Console](https://developer.yahoo.com/yql/console/?q=show%20tables&env=store://datatables.org/alltableswithkeys#h=select+*+from+yahoo.finance.quote+where+symbol+in+(%22YHOO%22%2C%22AAPL%22%2C%22GOOG%22%2C%22MSFT%22)),
if you [decode](https://meyerweb.com/eric/tools/dencoder/) **The Rest Query** you would be able to find all the values that you need to set here.

Feel free to create any PR to improve this Swagger definition. 