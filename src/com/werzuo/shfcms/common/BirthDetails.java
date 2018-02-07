/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werzuo.shfcms.common;

import com.werzuo.shfcms.view.HomeFrame;

/**
 *
 * @author SW96
 */
public class BirthDetails {

    private String nicNo;
    private String gender = "";
    private String age = "";
    private String dob = "";

    public BirthDetails(String nicNo) {
        this.nicNo = nicNo;
        calculateBirthDate();
        calculateAge();
    }

    /**
     *
     * @return dob
     */
    public String getBirthDay() {
        return dob;
    }

    /**
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * calculate the member age
     *
     * @return member's age
     */
    private void calculateAge() {
        String today = "2016-10-20" /*HomeFrame.getDate()*/;
        String[] split1 = today.split("-");
        String[] split2 = dob.split("-");
        Integer currentYear = Integer.valueOf(split1[0]);
        Integer birthYear = Integer.valueOf(split2[0]);

        int dif = (currentYear - birthYear);
        age = String.valueOf(dif);

    }

    /**
     * calculate the birth date
     */
    private void calculateBirthDate() {
        /**
         * old nic
         */
        if (nicNo.length() == 10) {
            String year = nicNo.substring(0, 2);
            Integer genderTemp = Integer.valueOf(nicNo.substring(2, 5));
            String calculate = "";
            if (genderTemp > 500) {
                calculate = calculate(genderTemp - 500);
                dob = ("19" + year + "-" + calculate);
                gender = "female";
            } else {
                calculate = calculate(genderTemp);
                dob = ("19" + year + "-" + calculate);
                gender = "male";
            }
        }

        /**
         * new nic
         */
        if (nicNo.length() == 12) {
            String year = nicNo.substring(0, 4);
            Integer genderTemp = Integer.valueOf(nicNo.substring(4, 7));
            String calculate = "";
            if (genderTemp > 500) {
                calculate = calculate(genderTemp - 500);
                dob = (year + "-" + calculate);
                gender = "female";
            } else {
                calculate = calculate(genderTemp);
                dob = (year + "-" + calculate);
                gender = "male";
            }
        }
    }

    /**
     * get the birth day and month
     *
     * @param number
     * @return day and month
     */
    private String calculate(int number) {
        String date = "";
        switch (number) {
            case 1:
                date = "01-01";
                break;
            case 2:
                date = "01-02";
                break;
            case 3:
                date = "01-03";
                break;
            case 4:
                date = "01-04";
                break;
            case 5:
                date = "01-05";
                break;
            case 6:
                date = "01-06";
                break;
            case 7:
                date = "01-07";
                break;
            case 8:
                date = "01-08";
                break;
            case 9:
                date = "01-09";
                break;
            case 10:
                date = "01-10";
                break;
            case 11:
                date = "01-11";
                break;
            case 12:
                date = "01-12";
                break;
            case 13:
                date = "01-13";
                break;
            case 14:
                date = "01-14";
                break;
            case 15:
                date = "01-15";
                break;
            case 16:
                date = "01-16";
                break;
            case 17:
                date = "01-17";
                break;
            case 18:
                date = "01-18";
                break;
            case 19:
                date = "01-19";
                break;
            case 20:
                date = "01-20";
                break;
            case 21:
                date = "01-21";
                break;
            case 22:
                date = "01-22";
                break;
            case 23:
                date = "01-23";
                break;
            case 24:
                date = "01-24";
                break;
            case 25:
                date = "01-25";
                break;
            case 26:
                date = "01-26";
                break;
            case 27:
                date = "01-27";
                break;
            case 28:
                date = "01-28";
                break;
            case 29:
                date = "01-29";
                break;
            case 30:
                date = "01-30";
                break;
            case 31:
                date = "01-31";
                break;

            case 32:
                date = "02-01";
                break;
            case 33:
                date = "02-02";
                break;
            case 34:
                date = "02-03";
                break;
            case 35:
                date = "02-04";
                break;
            case 36:
                date = "02-05";
                break;
            case 37:
                date = "02-06";
                break;
            case 38:
                date = "02-07";
                break;
            case 39:
                date = "02-08";
                break;
            case 40:
                date = "02-09";
                break;
            case 41:
                date = "02-10";
                break;
            case 42:
                date = "02-11";
                break;
            case 43:
                date = "02-12";
                break;
            case 44:
                date = "02-13";
                break;
            case 45:
                date = "02-14";
                break;
            case 46:
                date = "02-15";
                break;
            case 47:
                date = "02-16";
                break;
            case 48:
                date = "02-17";
                break;
            case 49:
                date = "02-18";
                break;
            case 50:
                date = "02-19";
                break;
            case 51:
                date = "02-20";
                break;
            case 52:
                date = "02-21";
                break;
            case 53:
                date = "02-22";
                break;
            case 54:
                date = "02-23";
                break;
            case 55:
                date = "02-24";
                break;
            case 56:
                date = "02-25";
                break;
            case 57:
                date = "02-26";
                break;
            case 58:
                date = "02-27";
                break;
            case 59:
                date = "02-28";
                break;
            case 60:
                date = "02-29";
                break;
            case 61:
                date = "03-01";
                break;
            case 62:
                date = "03-02";
                break;
            case 63:
                date = "03-03";
                break;
            case 64:
                date = "03-04";
                break;
            case 65:
                date = "03-05";
                break;
            case 66:
                date = "03-06";
                break;
            case 67:
                date = "03-07";
                break;
            case 68:
                date = "03-08";
                break;
            case 69:
                date = "03-09";
                break;
            case 70:
                date = "03-10";
                break;
            case 71:
                date = "03-11";
                break;
            case 72:
                date = "03-12";
                break;
            case 73:
                date = "03-13";
                break;
            case 74:
                date = "03-14";
                break;
            case 75:
                date = "03-15";
                break;
            case 76:
                date = "03-16";
                break;
            case 77:
                date = "03-17";
                break;
            case 78:
                date = "03-18";
                break;
            case 79:
                date = "03-19";
                break;
            case 80:
                date = "03-20";
                break;
            case 81:
                date = "03-21";
                break;
            case 82:
                date = "03-22";
                break;
            case 83:
                date = "03-23";
                break;
            case 84:
                date = "03-24";
                break;
            case 85:
                date = "03-25";
                break;
            case 86:
                date = "03-26";
                break;
            case 87:
                date = "03-27";
                break;
            case 88:
                date = "03-28";
                break;
            case 89:
                date = "03-29";
                break;
            case 90:
                date = "03-30";
                break;
            case 91:
                date = "03-31";
                break;
            case 92:
                date = "04-01";
                break;
            case 93:
                date = "04-02";
                break;
            case 94:
                date = "04-03";
                break;
            case 95:
                date = "04-04";
                break;
            case 96:
                date = "04-05";
                break;
            case 97:
                date = "04-06";
                break;
            case 98:
                date = "04-07";
                break;
            case 99:
                date = "04-08";
                break;
            case 100:
                date = "04-09";
                break;
            case 101:
                date = "04-10";
                break;
            case 102:
                date = "04-11";
                break;
            case 103:
                date = "04-12";
                break;
            case 104:
                date = "04-13";
                break;
            case 105:
                date = "04-14";
                break;
            case 106:
                date = "04-15";
                break;
            case 107:
                date = "04-16";
                break;
            case 108:
                date = "04-17";
                break;
            case 109:
                date = "04-18";
                break;
            case 110:
                date = "04-19";
                break;
            case 111:
                date = "04-20";
                break;
            case 112:
                date = "04-21";
                break;
            case 113:
                date = "04-22";
                break;
            case 114:
                date = "04-23";
                break;
            case 115:
                date = "04-24";
                break;
            case 116:
                date = "04-25";
                break;
            case 117:
                date = "04-26";
                break;
            case 118:
                date = "04-27";
                break;
            case 119:
                date = "04-28";
                break;
            case 120:
                date = "04-29";
                break;
            case 121:
                date = "04-30";
                break;
            case 122:
                date = "05-01";
                break;
            case 123:
                date = "05-02";
                break;
            case 124:
                date = "05-03";
                break;
            case 125:
                date = "05-04";
                break;
            case 126:
                date = "05-05";
                break;
            case 127:
                date = "05-06";
                break;
            case 128:
                date = "05-07";
                break;
            case 129:
                date = "05-08";
                break;
            case 130:
                date = "05-09";
                break;
            case 131:
                date = "05-10";
                break;
            case 132:
                date = "05-11";
                break;
            case 133:
                date = "05-12";
                break;
            case 134:
                date = "05-13";
                break;
            case 135:
                date = "05-14";
                break;
            case 136:
                date = "05-15";
                break;
            case 137:
                date = "05-16";
                break;
            case 138:
                date = "05-17";
                break;
            case 139:
                date = "05-18";
                break;
            case 140:
                date = "05-19";
                break;
            case 141:
                date = "05-20";
                break;
            case 142:
                date = "05-21";
                break;
            case 143:
                date = "05-22";
                break;
            case 144:
                date = "05-23";
                break;
            case 145:
                date = "05-24";
                break;
            case 146:
                date = "05-25";
                break;
            case 147:
                date = "05-26";
                break;
            case 148:
                date = "05-27";
                break;
            case 149:
                date = "05-28";
                break;
            case 150:
                date = "05-29";
                break;
            case 151:
                date = "05-30";
                break;
            case 152:
                date = "05-31";
                break;
            case 153:
                date = "06-01";
                break;
            case 154:
                date = "06-02";
                break;
            case 155:
                date = "06-03";
                break;
            case 156:
                date = "06-04";
                break;
            case 157:
                date = "06-05";
                break;
            case 158:
                date = "06-06";
                break;
            case 159:
                date = "06-07";
                break;
            case 160:
                date = "06-08";
                break;
            case 161:
                date = "06-09";
                break;
            case 162:
                date = "06-10";
                break;
            case 163:
                date = "06-11";
                break;
            case 164:
                date = "06-12";
                break;
            case 165:
                date = "06-13";
                break;
            case 166:
                date = "06-14";
                break;
            case 167:
                date = "06-15";
                break;
            case 168:
                date = "06-16";
                break;
            case 169:
                date = "06-17";
                break;
            case 170:
                date = "06-18";
                break;
            case 171:
                date = "06-19";
                break;
            case 172:
                date = "06-20";
                break;
            case 173:
                date = "06-21";
                break;
            case 174:
                date = "06-22";
                break;
            case 175:
                date = "06-23";
                break;
            case 176:
                date = "06-24";
                break;
            case 177:
                date = "06-25";
                break;
            case 178:
                date = "06-26";
                break;
            case 179:
                date = "06-27";
                break;
            case 180:
                date = "06-28";
                break;
            case 181:
                date = "06-29";
                break;
            case 182:
                date = "06-30";
                break;
            case 183:
                date = "07-01";
                break;
            case 184:
                date = "07-02";
                break;
            case 185:
                date = "07-03";
                break;
            case 186:
                date = "07-04";
                break;
            case 187:
                date = "07-05";
                break;
            case 188:
                date = "07-06";
                break;
            case 189:
                date = "07-07";
                break;
            case 190:
                date = "07-08";
                break;
            case 191:
                date = "07-09";
                break;
            case 192:
                date = "07-10";
                break;
            case 193:
                date = "07-11";
                break;
            case 194:
                date = "07-12";
                break;
            case 195:
                date = "07-13";
                break;
            case 196:
                date = "07-14";
                break;
            case 197:
                date = "07-15";
                break;
            case 198:
                date = "07-16";
                break;
            case 199:
                date = "07-17";
                break;
            case 200:
                date = "07-18";
                break;
            case 201:
                date = "07-19";
                break;
            case 202:
                date = "07-20";
                break;
            case 203:
                date = "07-21";
                break;
            case 204:
                date = "07-22";
                break;
            case 205:
                date = "07-23";
                break;
            case 206:
                date = "07-24";
                break;
            case 207:
                date = "07-25";
                break;
            case 208:
                date = "07-26";
                break;
            case 209:
                date = "07-27";
                break;
            case 210:
                date = "07-28";
                break;
            case 211:
                date = "07-29";
                break;
            case 212:
                date = "07-30";
                break;
            case 213:
                date = "07-31";
                break;
            case 214:
                date = "08-01";
                break;
            case 215:
                date = "08-02";
                break;
            case 216:
                date = "08-03";
                break;
            case 217:
                date = "08-04";
                break;
            case 218:
                date = "08-05";
                break;
            case 219:
                date = "08-06";
                break;
            case 220:
                date = "08-07";
                break;
            case 221:
                date = "08-08";
                break;
            case 222:
                date = "08-09";
                break;
            case 223:
                date = "08-10";
                break;
            case 224:
                date = "08-11";
                break;
            case 225:
                date = "08-12";
                break;
            case 226:
                date = "08-13";
                break;
            case 227:
                date = "08-14";
                break;
            case 228:
                date = "08-15";
                break;
            case 229:
                date = "08-16";
                break;
            case 230:
                date = "08-17";
                break;
            case 231:
                date = "08-18";
                break;
            case 232:
                date = "08-19";
                break;
            case 233:
                date = "08-20";
                break;
            case 234:
                date = "08-21";
                break;
            case 235:
                date = "08-22";
                break;
            case 236:
                date = "08-23";
                break;
            case 237:
                date = "08-24";
                break;
            case 238:
                date = "08-25";
                break;
            case 239:
                date = "08-26";
                break;
            case 240:
                date = "08-27";
                break;
            case 241:
                date = "08-28";
                break;
            case 242:
                date = "08-29";
                break;
            case 243:
                date = "08-30";
                break;
            case 244:
                date = "08-31";
                break;
            case 245:
                date = "09-01";
                break;
            case 246:
                date = "09-02";
                break;
            case 247:
                date = "09-03";
                break;
            case 248:
                date = "09-04";
                break;
            case 249:
                date = "09-05";
                break;
            case 250:
                date = "09-06";
                break;
            case 251:
                date = "09-07";
                break;
            case 252:
                date = "09-08";
                break;
            case 253:
                date = "09-09";
                break;
            case 254:
                date = "09-10";
                break;
            case 255:
                date = "09-11";
                break;
            case 256:
                date = "09-12";
                break;
            case 257:
                date = "09-13";
                break;
            case 258:
                date = "09-14";
                break;
            case 259:
                date = "09-15";
                break;
            case 260:
                date = "09-16";
                break;
            case 261:
                date = "09-17";
                break;
            case 262:
                date = "09-18";
                break;
            case 263:
                date = "09-19";
                break;
            case 264:
                date = "09-20";
                break;
            case 265:
                date = "09-21";
                break;
            case 266:
                date = "09-22";
                break;
            case 267:
                date = "09-23";
                break;
            case 268:
                date = "09-24";
                break;
            case 269:
                date = "09-25";
                break;
            case 270:
                date = "09-26";
                break;
            case 271:
                date = "09-27";
                break;
            case 272:
                date = "09-28";
                break;
            case 273:
                date = "09-29";
                break;
            case 274:
                date = "09-30";
                break;
            case 275:
                date = "09-01";
                break;
            case 276:
                date = "10-02";
                break;
            case 277:
                date = "10-03";
                break;
            case 278:
                date = "10-04";
                break;
            case 279:
                date = "10-05";
                break;
            case 280:
                date = "10-06";
                break;
            case 281:
                date = "10-07";
                break;
            case 282:
                date = "10-08";
                break;
            case 283:
                date = "10-09";
                break;
            case 284:
                date = "10-10";
                break;
            case 285:
                date = "10-11";
                break;
            case 286:
                date = "10-12";
                break;
            case 287:
                date = "10-13";
                break;
            case 288:
                date = "10-14";
                break;
            case 289:
                date = "10-15";
                break;
            case 290:
                date = "10-16";
                break;
            case 291:
                date = "10-17";
                break;
            case 292:
                date = "10-18";
                break;
            case 293:
                date = "10-19";
                break;
            case 294:
                date = "10-20";
                break;
            case 295:
                date = "10-21";
                break;
            case 296:
                date = "10-22";
                break;
            case 297:
                date = "10-23";
                break;
            case 298:
                date = "10-24";
                break;
            case 299:
                date = "10-25";
                break;
            case 300:
                date = "10-26";
                break;
            case 301:
                date = "10-27";
                break;
            case 302:
                date = "10-28";
                break;
            case 303:
                date = "10-29";
                break;
            case 304:
                date = "10-30";
                break;
            case 305:
                date = "10-31";
                break;
            case 306:
                date = "11-01";
                break;
            case 307:
                date = "11-02";
                break;
            case 308:
                date = "11-03";
                break;
            case 309:
                date = "11-04";
                break;
            case 310:
                date = "11-05";
                break;
            case 311:
                date = "11-06";
                break;
            case 312:
                date = "11-07";
                break;
            case 313:
                date = "11-08";
                break;
            case 314:
                date = "11-09";
                break;
            case 315:
                date = "11-10";
                break;
            case 316:
                date = "11-11";
                break;
            case 317:
                date = "11-12";
                break;
            case 318:
                date = "11-13";
                break;
            case 319:
                date = "11-14";
                break;
            case 320:
                date = "11-15";
                break;
            case 321:
                date = "11-16";
                break;
            case 322:
                date = "11-17";
                break;
            case 323:
                date = "11-18";
                break;
            case 324:
                date = "11-19";
                break;
            case 325:
                date = "11-20";
                break;
            case 326:
                date = "11-21";
                break;
            case 327:
                date = "11-22";
                break;
            case 328:
                date = "11-23";
                break;
            case 329:
                date = "11-24";
                break;
            case 330:
                date = "11-25";
                break;
            case 331:
                date = "11-26";
                break;
            case 332:
                date = "11-27";
                break;
            case 333:
                date = "11-28";
                break;
            case 334:
                date = "11-29";
                break;
            case 335:
                date = "11-30";
                break;
            case 336:
                date = "12-01";
                break;
            case 337:
                date = "12-02";
                break;
            case 338:
                date = "12-03";
                break;
            case 339:
                date = "12-04";
                break;
            case 340:
                date = "12-05";
                break;
            case 341:
                date = "12-06";
                break;
            case 342:
                date = "12-07";
                break;
            case 343:
                date = "12-08";
                break;
            case 344:
                date = "12-09";
                break;
            case 345:
                date = "12-10";
                break;
            case 346:
                date = "12-11";
                break;
            case 347:
                date = "12-12";
                break;
            case 348:
                date = "12-13";
                break;
            case 349:
                date = "12-14";
                break;
            case 350:
                date = "12-15";
                break;
            case 351:
                date = "12-16";
                break;
            case 352:
                date = "12-17";
                break;
            case 353:
                date = "12-18";
                break;
            case 354:
                date = "12-19";
                break;
            case 355:
                date = "12-20";
                break;
            case 356:
                date = "12-21";
                break;
            case 357:
                date = "12-22";
                break;
            case 358:
                date = "12-23";
                break;
            case 359:
                date = "12-24";
                break;
            case 360:
                date = "12-25";
                break;
            case 361:
                date = "12-26";
                break;
            case 362:
                date = "12-27";
                break;
            case 363:
                date = "12-28";
                break;
            case 364:
                date = "12-29";
                break;
            case 365:
                date = "12-30";
                break;
            case 366:
                date = "12-31";
        }

        return date;
    }
}
