package petclinic.Web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import petclinic.Service.PetClinicService;

@RestController
public class PetClinicController {
	@Autowired
    private PetClinicService petClinicService;
    @RequestMapping ("/owners")
    public ModelAndView getOwners(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("owners",petClinicService.findOwners());
        mav.setViewName("owners");
        return mav;
    }
    /*@RequestMapping("/createOwner")
    public ModelAndView responseBody(){
    	Owner owner = new Owner("mahmut hilmi", "arikmert",5L); 
    	petClinicService.createOwner(owner);
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("owners", petClinicService.findOwners());
    	mav.setViewName("owners");
    	return mav;
    }*/
}
