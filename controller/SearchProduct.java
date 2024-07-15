package controller;

import dao.SachDAO;
import java.util.ArrayList;
import model.Sach;

public class SearchProduct {

    public static SearchProduct getInstance() {
        return new SearchProduct();
    }

    public ArrayList<Sach> searchTatCa(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getMaSH().toLowerCase().contains(text.toLowerCase()) || mt.getTenSH().toLowerCase().contains(text.toLowerCase())
                        || mt.getTacGia().toLowerCase().contains(text.toLowerCase())
                        || mt.getNhaXB().toLowerCase().contains(text.toLowerCase())
                        || mt.getNgayPH().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<Sach> searchMaSH(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getMaSH().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<Sach> searchTenMay(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (mt.getTenSH().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<Sach> searchSoLuong(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {
                if (text.length() != 0) {
                    if (mt.getSoLuong() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                } else {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<Sach> searchDonGia(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTrangThai() == 1) {

                if (text.length() != 0) {
                    if (mt.getGia() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                }
                else {
                    result.add(mt);
                }
            } 
        }
        return result;
    }

    public ArrayList<Sach> searchTacGia(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getTacGia().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<Sach> searchNXB(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getNhaXB().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<Sach> searchNgayPH(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getNgayPH().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<Sach> searchMoTa(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getMoTa().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }


//    public ArrayList<Sach> searchXuatXu(String text) {
//        ArrayList<Sach> result = new ArrayList<>();
//        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
//        for (var mt : armt) {
//            if (mt.getXuatXu().toLowerCase().contains(text.toLowerCase())) {
//                result.add(mt);
//            }
//        }
//        return result;
//    }

    public ArrayList<Sach> searchDaXoa(String text) {
        ArrayList<Sach> result = new ArrayList<>();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAll();
        for (var mt : armt) {
            if (mt.getTrangThai() == 0) {
                if (mt.getMaSH().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public Sach searchId(String text) {
        Sach result = new Sach();
        ArrayList<Sach> armt = SachDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getMaSH().toLowerCase().contains(text.toLowerCase())) {
                return mt;
            }
        }
        return null;
    }
}
