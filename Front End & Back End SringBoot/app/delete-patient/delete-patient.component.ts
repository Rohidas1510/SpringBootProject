import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Patient } from 'model/patient';
import { PatientService } from 'service/patient.service';

@Component({
  selector: 'app-delete-patient',
  templateUrl: './delete-patient.component.html',
  styleUrls: ['./delete-patient.component.css']
})
export class DeletePatientComponent implements OnInit {

  patient: Patient ;
  

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private patientService: PatientService) {
    this.patient = new Patient();
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  deletePatient(id1:string){
    let id = parseInt(id1);
    this.patientService.delete(id).subscribe(result => this.gotoPatient());
  }
  
    gotoPatient() {
      this.router.navigate(['../']);
    }


}
