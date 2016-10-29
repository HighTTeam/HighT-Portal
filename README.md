# High-T-Portal

### Spring boot devtools - Static content reloading does not work in IntelliJ

You need to turn on a couple of features in IntelliJ to make this work.

First, there's a project specific setting which you would need to apply on any project you want to use devtools in. Go to Preferences > Compiler and enable "Make project automatically."

The next setting is an IDEA registry setting that applies to all projects. In OSX, press Shift+Command+A and enter "Registry" in the search box that appears. Lookup compiler.automake.allow.when.app.running and enable it.

After that, restart your app. You will notice that the project keeps rebuilding with every change you make. When you check out the result in the browser, you will see both static files and code have been updated.