import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class RestDataService {
    constructor(private httpSource: HttpClient){

    }

    saveOneEntity(url: string, param: any){
        return this.httpSource.post(url,param);
    }

}
