package org.factsystem.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.factsystem.model.Fact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Object home() {
		try {
			File f = new File("/home/ari/Documents/STSWorkspace/sample_fatcs.xml");
			
			XStream xstream = new XStream(new PureJavaReflectionProvider());
			ObjectInputStream in = xstream.createObjectInputStream(new FileInputStream(f));
			Object o = in.readObject();
			
			return o;
		} catch (Throwable e) {
			/* PokeCatch */
		}
		
		return null;
	}
	
}
