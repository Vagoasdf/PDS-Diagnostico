/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SampleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if (action.equals("create")) {
				ORMDatabaseInitiator.createSchema(orm.PDSPersistentManager.instance());
			}
			else if (action.equals("drop")) {
				ORMDatabaseInitiator.dropSchema(orm.PDSPersistentManager.instance());
			}
			else {
				if (action.equals("insert")) {
					CreatePDSData createPDSData = new CreatePDSData();
					createPDSData.createTestData();
				}
				else if (action.equals("update")) {
					RetrieveAndUpdatePDSData retrieveAndUpdatePDSData = new RetrieveAndUpdatePDSData();
					retrieveAndUpdatePDSData.retrieveAndUpdateTestData();
				}
				else if (action.equals("delete")) {
					DeletePDSData deletePDSData = new DeletePDSData();
					deletePDSData.deleteTestData();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//***** To ensure persistent session is closed after every request, either add the following lines to "Web.xml" (recommended):
		//
		//<filter>
		//  <filter-name>ORMFilter</filter-name>
		//	<filter-class>ormsamples.PDSFilter</filter-class>
		//</filter>
		//
		//<filter-mapping>
		//	<filter-name>ORMFilter</filter-name>
		//	<url-pattern>/*</url-pattern>
		//</filter-mapping>
		//
		//***** or add the following statement at the end of each servlet that used ORM:
		//
		//orm.PDSPersistentManager.instance().getSession().close();", true);
		
		PrintWriter lWriter = response.getWriter();
		lWriter.println("Sample Servlet. Action = " + action);
		lWriter.close();
	}
}
