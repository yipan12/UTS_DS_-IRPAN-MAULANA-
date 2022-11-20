public class Mahasiswa {
    public class Student {
        private lectures[] lecture;
        private kelas[] kela;
        private intid [] id;
        private TglMsk[] Tgl;

        public Student(intid[] id, TglMsk[] tgl) {
            this.id = id;
            this.Tgl = tgl;
        }


        //set
        public void setStudentLecture(lectures[] lecture) {
            this.lecture = lecture;
        }

        public void setStudentKelas(kelas[] kelas1) {
            this.kela = kela;
        }
        public void setStudentintid(intid[] id) {
            this.id = id;
        }
        public void setStudentTglMsk(TglMsk[] tgl) {
            this.Tgl = tgl;
        }
        // get
        public lectures[] getStudentLecture() {
            return lecture;
        }
        public intid[] getStudentintd() {
            return id;
        }

            public kelas[] getStudentKelas() {
            return kela;
        }

        public void main(String[] args, TglMsk[] tgl) {
            Student student = new Student(id, tgl);
            lectures[] lectures = new lectures[5];
            lectures[0] = new lectures("pak ahsani");
            lectures[1] = new lectures("ibu suci");
            lectures[2] = new lectures("reksa m ariansyah");
            lectures[3] = new lectures("irpan st skom");
            lectures[4] = new lectures("sandhika galih");
            lectures[5] = new lectures("eko kurniawan khanedy");
            kelas[] kela = new kelas[5];
            kela[0] =new kelas("tifpk22");
            kela[1] =new kelas("tifpk22");
            kela[2] =new kelas("tifpk22");
            kela[3] =new kelas("tifpk22");
            kela[4] =new kelas("tifpk22");
            kela[5] =new kelas("tifpk22");
            //intid
            intid[] id = new intid[5];
            id[0] =new intid(1);
            id[1] =new intid(2);
            id[2] =new intid(3);
            id[3] =new intid(4);
            id[4] =new intid(5);
            id[5] =new intid(6);
            //
            tgl = new TglMsk[5];
            tgl[0] = new TglMsk(12);
            tgl[1] = new TglMsk(13);
            tgl[2] = new TglMsk(13);
            tgl[3] = new TglMsk(13);
            tgl[4] = new TglMsk(13);
            tgl[5] = new TglMsk(13);
            student.setStudentLecture(lectures);
            student.setStudentKelas(kela);
            student.setStudentintid(id);
            student.setStudentTglMsk(tgl);
            Mahasiswa.lectures[] lectures1 = student.getStudentLecture();
            for (int i = 0; i < lectures1.length; ++i) {
                System.out.println(lectures1[i].getName());
            }
            for (int i = 0; i < kela.length; ++i) {
                System.out.println(lectures1[i].getName());
            }
            for (int i = 0; i < id.length; ++i) {
                System.out.println(lectures1[i].getName());
            }
            for (int i = 0; i < tgl.length; ++i) {
                System.out.println(lectures1[i].getName());
            }
        }
    }

    public static class lectures {
        private String name;

        public lectures(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private class intid {
        public intid(int i) {

        }
    }
}



