export * from './createInstallmentPlanApi';
import { CreateInstallmentPlanApi } from './createInstallmentPlanApi';
export * from './infrastructureApi';
import { InfrastructureApi } from './infrastructureApi';
export * from './installmentPlanApi';
import { InstallmentPlanApi } from './installmentPlanApi';
export * from './loginApi';
import { LoginApi } from './loginApi';
import * as fs from 'fs';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;

export const APIS = [CreateInstallmentPlanApi, InfrastructureApi, InstallmentPlanApi, LoginApi];
