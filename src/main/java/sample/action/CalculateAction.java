package sample.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import sample.form.CalculateForm;

public class CalculateAction {
	
	@ActionForm
	@Resource
	protected CalculateForm calculateForm;
	
	@Resource
	protected HttpServletRequest request;
	
	@Execute(validator = false)
	public String index(){
		return "calculateInput.jsp";
	}
	
	@Execute(validator = false)
	public String calculate(){
		int int1 = Integer.parseInt(calculateForm.args1);
		int int2 = Integer.parseInt(calculateForm.args2);
		int ans = int1 + int2;
		request.setAttribute("ans", ans);
		return "calculateResult.jsp";
	}
	
}
