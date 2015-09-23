package aoptest;

/**
 * @author Naughty610
 */
public class PersonServiceBean implements PersonService {

	private String user = null;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public PersonServiceBean() {
		super();
	}

	public PersonServiceBean(String user) {
		super();
		this.user = user;
	}

	public void aoptest() {
		p("aoptest()函数被调用");
	}

	public void p(Object o) {
		System.out.println(o);
	}
}
