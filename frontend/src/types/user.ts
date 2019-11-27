export interface userType {
  id: number;
  userId: string;
  name: string;
  nickName?: string;
  userImage?: string;
  gender: genderEnum;
  address: string;
  birthDate: string;
  phoneNumber?: string;
  phoneNumberVerified?: number;
  email: string;
  emailVerify: number;
  registerDate: string;
  lastLoggedIn: string;
}

enum genderEnum {
  MEN,
  WOMEN
}
