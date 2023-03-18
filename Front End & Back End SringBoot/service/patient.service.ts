import { Injectable } from '@angular/core';
import { Patient } from 'model/patient';
import { Observable } from 'rxjs/internal/Observable';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
  private patientUrl: string;
  constructor(private http:HttpClient) {
    this.patientUrl = 'http://localhost:2020/Patient';
   }
   public findAll(): Observable<Patient[]> {
    return this.http.get<Patient[]>(this.patientUrl);
  }

  public save(patient: Patient) {
    return this.http.post<Patient>(this.patientUrl, patient);
  }
  public delete(id:number):Observable<Object>{
    return this.http.delete(`${this.patientUrl}/${id}`);
  }
  public update(patient: Patient,id:number):Observable<Object>{
    // return this.http.put<Patient>(this.usersUrl/{pid}, patient);
     return this.http.put(`${this.patientUrl}/${id}`,patient);
   }
}
