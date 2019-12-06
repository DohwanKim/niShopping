export interface productType {
  id: number;
  pid: number;
  name: string;
  price: number;
  salesRate?: number;
  promotion?: string;
  seller: string;
  image?: string;
  stock: number;
  score?: number;
  release: string;
  translator?: string;
  author: string;
  publisher: string;
  summary?: string;
  size?: string;
  weight?: string;
  pages?: number;
}
