export interface cartTypeArray {
  [pid: string]: cartType;
}

export interface cartType {
  id: number;
  userId: string;
  productId: string;
  quantity: number;
  totalPrice: number;
}
