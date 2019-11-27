import { userType } from './user';
import { productType } from './product';

export interface stateType {
  user : userType,
  product? : productType,
}
