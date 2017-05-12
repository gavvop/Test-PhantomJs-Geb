# Test-PhantomJs-Geb

Simple Geb - PhantomJs integration


To test it simply run 
```
gradle test
```

It works only under windows, but is simply add *nix support by editing /src/test/groovy/mytest/GebConfig.groovy

```groovy
// set phantomjs binary path for windows - in bin/phantomjs.exe
if (System.properties['os.name'].toLowerCase().contains('windows')) {
    phantomjsBin = new File('bin/phantomjs.exe').getAbsolutePath();
}
```
