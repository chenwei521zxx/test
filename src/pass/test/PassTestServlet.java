package pass.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ucloud.paas.proxy.cache.CacheService;

public class PassTestServlet extends HttpServlet {
	/**
	 * Constructor of the object.
	 */
	public PassTestServlet() {
		super();
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("****************************************");
		
		CacheService cache = new CacheService();
		boolean flag=cache.add("csxx", "123456");
		
		System.out.println("flag===="+flag);
		
		CacheService cache1 = new CacheService();
		Object obj=cache1.get("csxx");
		System.out.println("obj===="+obj);
		
		
		System.out.println("****************************************");
		
		
	}

	
}
