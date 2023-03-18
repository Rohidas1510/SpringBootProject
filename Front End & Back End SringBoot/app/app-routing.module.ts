import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DeletePatientComponent } from './delete-patient/delete-patient.component';
import { PatientFormComponent } from './patient-Form/patient-form.component';
import { PatientComponent } from './patient/patient.component';
import { UpdatePatientComponent } from './update-patient/update-patient.component';

const routes: Routes = [
  { path: 'patient', component: PatientComponent },
  { path: 'addpatient', component: PatientFormComponent },
  { path: 'deletepatient', component:DeletePatientComponent },
  {path:"updatepatient", component:UpdatePatientComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
