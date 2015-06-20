package com.letsoh.process;

	import javax.servlet.ServletConfig;
	import javax.servlet.ServletContext;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;

	import org.apache.log4j.BasicConfigurator;
	import org.apache.log4j.PropertyConfigurator;

	public class Log4JInitServlet extends HttpServlet {

		private static final long serialVersionUID = 1L;

		public void init(ServletConfig config) throws ServletException {
			System.out.println("Log4JInitServlet is initializing log4j");
			String log4jLocation = config.getInitParameter("log4j-properties-location");

			ServletContext sc = config.getServletContext();

			if (log4jLocation == null) {
				System.err.println("*** No log4j-properties-location init param, so initializing log4j with BasicConfigurator");
				BasicConfigurator.configure();
			} else {
				String webAppPath = sc.getRealPath("/");
				System.out.println("webAppPath::::"+webAppPath);
				String log4jProp = webAppPath + log4jLocation;
						PropertyConfigurator.configure(log4jProp);
			}
			
			super.init(config);
		}
	}


