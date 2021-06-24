package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolInfo;

@RestController
@RequestMapping("/api/SchoolInfos")
@CrossOrigin
public class SchoolInfosControllers {
  
  private SchoolService schoolService;

  @Autowired
  public SchoolInfosControllers(SchoolService schoolService){
    super();
    this.schoolService = schoolService;
     }
   @GetMapping("/getall")
   public DataResult<List<SchoolInfos>> getall(){
     return this.SchoolService getall();  
     
   }
   
  @PostMapping
  public Result add(@validation @RequestBody SchoolInfos school){
    return this.schoolService.add(school)
  }
   
   @GetMapping("/getDESCOrderByGraduationDate")
	public DataResult<List<SchoolInfo>> getDESCOrderByGraduationDate(int jobSeekerId){
		return this.schoolService.getByJobSeekerIdOrderByGraduationDateDESC(jobSeekerId);
	}
    
}
  
  
