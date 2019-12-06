import { userType } from './user';
import { cartTypeArray } from './cart';
import { likeType } from './like';

export interface stateType {
  user : userType,
  cart : cartTypeArray,
  like : Array<likeType>,
}
