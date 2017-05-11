import org.openqa.selenium.phantomjs.PhantomJSDriver;

def phantomjsBin = "";

// set phantomjs binary path for windows - in bin/phantomjs.exe
if (System.properties['os.name'].toLowerCase().contains('windows')) {
    phantomjsBin = new File('bin/phantomjs.exe').getAbsolutePath();
}

// set phantomjs path
System.setProperty('phantomjs.binary.path', phantomjsBin)

// set the global driver
driver = { new PhantomJSDriver() }
