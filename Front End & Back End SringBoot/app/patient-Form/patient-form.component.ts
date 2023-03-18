import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Patient } from 'model/patient';
import { PatientService } from 'service/patient.service';

@Component({
  selector: 'app-patient-form',
  templateUrl: './patient-form.component.html',
  styleUrls: ['./patient-form.component.css']
})
export class PatientFormComponent implements OnInit {
  patient: Patient ;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private patientService: PatientService){
    this.patient = new Patient();
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  onSubmit() {
    this.patientService.save(this.patient).subscribe((result: any) => this.gotoPatient());
  }
  gotoPatient() {
    this.router.navigate(['../']);
  }

 

}
